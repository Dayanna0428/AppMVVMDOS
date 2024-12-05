package com.dayanna.appmvvmdos.ui;


import android.view.View;

import androidx.annotation.NonNull;

/**
     * Returns the outermost {@link View} in the associated layout file. If this binding is for a
     * {@code <merge>} layout, this will return the first view inside of the merge tag.
     */
    @NonNull
    View getRoot();
}
