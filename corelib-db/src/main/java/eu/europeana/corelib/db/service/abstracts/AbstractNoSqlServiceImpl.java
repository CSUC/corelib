/*
 * Copyright 2007-2012 The Europeana Foundation
 *
 *  Licenced under the EUPL, Version 1.1 (the "Licence") and subsequent versions as approved 
 *  by the European Commission;
 *  You may not use this work except in compliance with the Licence.
 *  
 *  You may obtain a copy of the Licence at:
 *  http://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under 
 *  the Licence is distributed on an "AS IS" basis, without warranties or conditions of 
 *  any kind, either express or implied.
 *  See the Licence for the specific language governing permissions and limitations under 
 *  the Licence.
 */
package eu.europeana.corelib.db.service.abstracts;

import java.io.Serializable;

import org.mongodb.morphia.Key;

import eu.europeana.corelib.db.dao.NosqlDao;
import eu.europeana.corelib.db.entity.nosql.abstracts.NoSqlEntity;

/**
 * Implementation od the {@link AbstractNoSqlService}
 *
 * @param <E>
 * @param <T>
 */
public abstract class AbstractNoSqlServiceImpl<E extends NoSqlEntity, T extends Serializable> implements AbstractNoSqlService<E, T> {

	private NosqlDao<E,T> dao;

	@Override
	public void remove(T id) {
		dao.deleteById(id);
	}

	@Override
	public E findByID(T id) {
		return dao.get(id);
	}

	@Override
	public Iterable<E> findAll() {
		return dao.find().asList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public E store(E object) {
		Key<E> key = dao.save(object);
		return dao.get((T) key.getId());
	}

	@Override
	public boolean exists(T id) {
		return dao.exists("_id", id);
	}
	
	@Override
	public long count() {
		return dao.count();
	}

	/**
	 * Used by Bean configuration to inject Entity based DAO.
	 * 
	 * @param dao
	 *            DAO object with entity based generic set
	 */
	public final void setDao(NosqlDao<E,T> dao) {
		this.dao = dao;
	}

	/**
	 * Getter for DAO, only available for internal usage.
	 * 
	 * @return Generic DAO class
	 */
	protected NosqlDao<E,T> getDao() {
		return dao;
	}
}
