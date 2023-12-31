// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView contactRecycler;

  @NonNull
  public final EditText searchBox;

  @NonNull
  public final Button searchButton;

  @NonNull
  public final TextView textGallery;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView contactRecycler, @NonNull EditText searchBox,
      @NonNull Button searchButton, @NonNull TextView textGallery) {
    this.rootView = rootView;
    this.contactRecycler = contactRecycler;
    this.searchBox = searchBox;
    this.searchButton = searchButton;
    this.textGallery = textGallery;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contact_recycler;
      RecyclerView contactRecycler = ViewBindings.findChildViewById(rootView, id);
      if (contactRecycler == null) {
        break missingId;
      }

      id = R.id.searchBox;
      EditText searchBox = ViewBindings.findChildViewById(rootView, id);
      if (searchBox == null) {
        break missingId;
      }

      id = R.id.searchButton;
      Button searchButton = ViewBindings.findChildViewById(rootView, id);
      if (searchButton == null) {
        break missingId;
      }

      id = R.id.text_gallery;
      TextView textGallery = ViewBindings.findChildViewById(rootView, id);
      if (textGallery == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, contactRecycler, searchBox,
          searchButton, textGallery);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
