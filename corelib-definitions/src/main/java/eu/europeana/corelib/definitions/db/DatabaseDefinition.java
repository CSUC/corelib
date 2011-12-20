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

package eu.europeana.corelib.definitions.db;

/**
 * This class gathers the constant field sizes, used in both entity annotations
 * and in code that fills the field values (for limiting size).
 * 
 * @author Gerald de Jong <geralddejong@gmail.com>
 */

public interface DatabaseDefinition {

	// user
	public static final String TABLENAME_USER = "users";
	public static final int FIELDSIZE_PERSONAL = 100;
	public static final int FIELDSIZE_PASSWORD = 64;
	public static final int FIELDSIZE_IDENTIFIER = 30;
    public static final int FIELDSIZE_USERNAME = 60;

	// token
	public static final String TABLENAME_TOKEN = "token";
	public static final int FIELDSIZE_TOKEN = 32;
}