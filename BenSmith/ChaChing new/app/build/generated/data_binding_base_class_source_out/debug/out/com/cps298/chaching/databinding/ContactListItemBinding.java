// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContactListItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView contactRow;

  @NonNull
  public final ImageView deleteBtn;

  @NonNull
  public final TextView feeRow;

  @NonNull
  public final TextView numberRow;

  @NonNull
  public final TextView ownershipRow;

  @NonNull
  public final TextView perkRow;

  @NonNull
  public final TextView primarykeyRow;

  @NonNull
  public final ConstraintLayout relativeLayout;

  @NonNull
  public final TextView useCategoryRow;

  private ContactListItemBinding(@NonNull CardView rootView, @NonNull TextView contactRow,
      @NonNull ImageView deleteBtn, @NonNull TextView feeRow, @NonNull TextView numberRow,
      @NonNull TextView ownershipRow, @NonNull TextView perkRow, @NonNull TextView primarykeyRow,
      @NonNull ConstraintLayout relativeLayout, @NonNull TextView useCategoryRow) {
    this.rootView = rootView;
    this.contactRow = contactRow;
    this.deleteBtn = deleteBtn;
    this.feeRow = feeRow;
    this.numberRow = numberRow;
    this.ownershipRow = ownershipRow;
    this.perkRow = perkRow;
    this.primarykeyRow = primarykeyRow;
    this.relativeLayout = relativeLayout;
    this.useCategoryRow = useCategoryRow;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ContactListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContactListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.contact_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContactListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contact_row;
      TextView contactRow = ViewBindings.findChildViewById(rootView, id);
      if (contactRow == null) {
        break missingId;
      }

      id = R.id.deleteBtn;
      ImageView deleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteBtn == null) {
        break missingId;
      }

      id = R.id.fee_row;
      TextView feeRow = ViewBindings.findChildViewById(rootView, id);
      if (feeRow == null) {
        break missingId;
      }

      id = R.id.number_row;
      TextView numberRow = ViewBindings.findChildViewById(rootView, id);
      if (numberRow == null) {
        break missingId;
      }

      id = R.id.ownership_row;
      TextView ownershipRow = ViewBindings.findChildViewById(rootView, id);
      if (ownershipRow == null) {
        break missingId;
      }

      id = R.id.perk_row;
      TextView perkRow = ViewBindings.findChildViewById(rootView, id);
      if (perkRow == null) {
        break missingId;
      }

      id = R.id.primarykey_row;
      TextView primarykeyRow = ViewBindings.findChildViewById(rootView, id);
      if (primarykeyRow == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      ConstraintLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.useCategory_row;
      TextView useCategoryRow = ViewBindings.findChildViewById(rootView, id);
      if (useCategoryRow == null) {
        break missingId;
      }

      return new ContactListItemBinding((CardView) rootView, contactRow, deleteBtn, feeRow,
          numberRow, ownershipRow, perkRow, primarykeyRow, relativeLayout, useCategoryRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
