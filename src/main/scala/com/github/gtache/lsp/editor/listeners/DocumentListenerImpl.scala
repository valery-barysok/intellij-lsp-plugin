/**
 *     Copyright 2017-2018 Guillaume Tâche
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package com.github.gtache.lsp.editor.listeners

import com.intellij.openapi.editor.event.{DocumentEvent, DocumentListener}

/**
  * Implementation of a DocumentListener
  */
class DocumentListenerImpl extends DocumentListener with LSPListener {

  /**
    * Called before the text of the document is changed.
    *
    * @param event the event containing the information about the change.
    */
  override def beforeDocumentChange(event: DocumentEvent): Unit = {
  }


  /**
    * Called after the text of the document has been changed.
    *
    * @param event the event containing the information about the change.
    */
  override def documentChanged(event: DocumentEvent): Unit = {
    if (checkManager()) {
      manager.documentChanged(event)
    }
  }

}
