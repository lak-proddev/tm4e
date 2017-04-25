/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.tm4e.registry;

import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.tm4e.core.grammar.IGrammar;

/**
 * 
 * TextMate Grammar registry manager API.
 *
 */
public interface IGrammarRegistryManager {

	/**
	 * Returns the {@link IGrammar} for the given content types.
	 * 
	 * @param contentTypes
	 *            the content type.
	 * @return the {@link IGrammar} for the given content type.
	 */
	IGrammar getGrammarFor(IContentType[] contentTypes);

	/**
	 * Returns the list of registered TextMate grammars.
	 * 
	 * @return the list of registered TextMate grammars.
	 */
	IGrammarDefinition[] getDefinitions();

}
