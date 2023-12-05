// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Toolbar toolbar2;

  private MainFragmentBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout frameLayout,
      @NonNull LinearLayout main, @NonNull Toolbar toolbar2) {
    this.rootView = rootView;
    this.frameLayout = frameLayout;
    this.main = main;
    this.toolbar2 = toolbar2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      return new MainFragmentBinding((LinearLayout) rootView, frameLayout, main, toolbar2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
