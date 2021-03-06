/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.ext.git.client.importer.page;

import com.codenvy.ide.api.mvp.View;
import com.google.inject.ImplementedBy;

import javax.annotation.Nonnull;

/**
 * @author Roman Nikitenko
 */
@ImplementedBy(GitImporterPageViewImpl.class)
public interface GitImporterPageView extends View<GitImporterPageView.ActionDelegate> {
    public interface ActionDelegate {
        /** Performs any actions appropriate in response to the user having changed the project's name. */
        void projectNameChanged(@Nonnull String name);

        /** Performs any actions appropriate in response to the user having changed the project's URL. */
        void projectUrlChanged(@Nonnull String url);

        /** Performs any actions appropriate in response to the user having changed the project's description. */
        void projectDescriptionChanged(@Nonnull String projectDescriptionValue);

        /** Performs any actions appropriate in response to the user having changed the project's visibility. */
        void projectVisibilityChanged(boolean aPublic);
    }

    /** Show the name error. */
    void showNameError();

    /** Hide the name error. */
    void hideNameError();

    /** Show URL error. */
    void showUrlError(@Nonnull String message);

    /** Hide URL error. */
    void hideUrlError();

    /**
     * Set the project's URL.
     *
     * @param url
     *         the project's URL to set
     */
    void setProjectUrl(@Nonnull String url);

    /**
     * Get the project's name value.
     *
     * @return {@link String} project's name
     */
    @Nonnull
    String getProjectName();

    /**
     * Set the project's name value.
     *
     * @param projectName
     *         project's name to set
     */
    void setProjectName(@Nonnull String projectName);

    /** Give focus to project's URL input. */
    void focusInUrlInput();

    /**
     * Set the enable state of the inputs.
     *
     * @param isEnabled
     *         <code>true</code> if enabled, <code>false</code> if disabled
     */
    void setInputsEnableState(boolean isEnabled);

    void setProjectDescription(@Nonnull String projectDescription);

    void setVisibility(boolean visible);
}
