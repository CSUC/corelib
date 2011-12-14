/*
 * Copyright 2007 EDL FOUNDATION
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they
 * will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * you may not use this work except in compliance with the
 * Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 */

package eu.europeana.corelib.db.dao;

import java.io.Serializable;

import eu.europeana.corelib.db.entity.abstracts.IdentifiedEntity;


public interface Dao<E extends IdentifiedEntity<?>> {
	
	/*
	 * FINDERS
	 */

	/**
	 * Retrieve a row through a private key
	 * 
	 * @param pk
	 *            A private key object
	 * @return Returns a row
	 */
	E findByPK(final Serializable id);

	/*
	 * MODIFIERS
	 */

	/**
	 * insert a new row into the database
	 * 
	 * @param object
	 *            The new row to insert
	 */
	E insert(E object);

	/**
	 * update a row in the database
	 * 
	 * @param object
	 *            Existing object to update
	 */
	E update(E object);

	/**
	 * Delete a existing object in the database
	 * 
	 * @param object
	 *            The existing row to delete
	 */
	void delete(E object);

}
