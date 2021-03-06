/**  
 *  Copyright 2011 Capgemini & SDL
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.dd4t.contentmodel;

import org.dd4t.core.caching.Cachable;

/**
 * Interface for a published item
 * 
 * @author bjornl
 * 
 */
public interface PublishedItem extends RepositoryLocalItem, Cachable {
	/**
	 * The published source
	 * 
	 * @return the source as a string
	 */
	public String getSource();

	/**
	 * Set the source
	 * 
	 * @param source
	 */
	public void setSource(String source);

	/**
	 * Get the tridion native metadata
	 * 
	 * @return the native metadata
	 */
	public com.tridion.storage.ItemMeta getNativeMetadata();

	/**
	 * Set the native tridion metadata
	 * 
	 * @param metadata
	 */
	public void setNativeMetadata(com.tridion.storage.ItemMeta metadata);
}
