/*******************************************************************************
 * Copyright (c) 2008-2011 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.refactoring.exclude;

import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

import org.eclipse.m2e.core.project.IMavenProjectFacade;


/**
 * @author Anton Kraev
 */
public class MavenExcludeWizard extends RefactoringWizard {

  private IMavenProjectFacade facade;

  private ExcludeWizardPage excludePage;

  public MavenExcludeWizard(ExcludeArtifactRefactoring refactoring, IMavenProjectFacade facade) {
    super(refactoring, DIALOG_BASED_USER_INTERFACE);
    this.facade = facade;
  }

  @Override
  protected void addUserInputPages() {
    setDefaultPageTitle(getRefactoring().getName());
    excludePage = new ExcludeWizardPage(facade);
    addPage(excludePage);
  }
}
