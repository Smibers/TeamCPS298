// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class MainActivity2Binding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout container;

  private MainActivity2Binding(@NonNull FrameLayout rootView, @NonNull FrameLayout container) {
    this.rootView = rootView;
    this.container = container;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainActivity2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainActivity2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_activity2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainActivity2Binding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    FrameLayout container = (FrameLayout) rootView;

    return new MainActivity2Binding((FrameLayout) rootView, container);
  }
}