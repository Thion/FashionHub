// Generated by view binder compiler. Do not edit!
package com.example.formosafashionhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.formosafashionhub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTrousersUploadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button TrousersBtnSave;

  @NonNull
  public final Button TrousersBtnUpdate;

  @NonNull
  public final ImageView TrousersimageView;

  @NonNull
  public final EditText mEdtDescriptionTrousers;

  @NonNull
  public final EditText mEdtPriceTrousers;

  @NonNull
  public final EditText mEdtTrousersName;

  @NonNull
  public final RecyclerView trousersrecyclerView;

  private ActivityTrousersUploadBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button TrousersBtnSave, @NonNull Button TrousersBtnUpdate,
      @NonNull ImageView TrousersimageView, @NonNull EditText mEdtDescriptionTrousers,
      @NonNull EditText mEdtPriceTrousers, @NonNull EditText mEdtTrousersName,
      @NonNull RecyclerView trousersrecyclerView) {
    this.rootView = rootView;
    this.TrousersBtnSave = TrousersBtnSave;
    this.TrousersBtnUpdate = TrousersBtnUpdate;
    this.TrousersimageView = TrousersimageView;
    this.mEdtDescriptionTrousers = mEdtDescriptionTrousers;
    this.mEdtPriceTrousers = mEdtPriceTrousers;
    this.mEdtTrousersName = mEdtTrousersName;
    this.trousersrecyclerView = trousersrecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTrousersUploadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTrousersUploadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_trousers_upload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTrousersUploadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TrousersBtnSave;
      Button TrousersBtnSave = ViewBindings.findChildViewById(rootView, id);
      if (TrousersBtnSave == null) {
        break missingId;
      }

      id = R.id.TrousersBtnUpdate;
      Button TrousersBtnUpdate = ViewBindings.findChildViewById(rootView, id);
      if (TrousersBtnUpdate == null) {
        break missingId;
      }

      id = R.id.TrousersimageView;
      ImageView TrousersimageView = ViewBindings.findChildViewById(rootView, id);
      if (TrousersimageView == null) {
        break missingId;
      }

      id = R.id.mEdtDescriptionTrousers;
      EditText mEdtDescriptionTrousers = ViewBindings.findChildViewById(rootView, id);
      if (mEdtDescriptionTrousers == null) {
        break missingId;
      }

      id = R.id.mEdtPriceTrousers;
      EditText mEdtPriceTrousers = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPriceTrousers == null) {
        break missingId;
      }

      id = R.id.mEdtTrousersName;
      EditText mEdtTrousersName = ViewBindings.findChildViewById(rootView, id);
      if (mEdtTrousersName == null) {
        break missingId;
      }

      id = R.id.trousersrecyclerView;
      RecyclerView trousersrecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (trousersrecyclerView == null) {
        break missingId;
      }

      return new ActivityTrousersUploadBinding((ConstraintLayout) rootView, TrousersBtnSave,
          TrousersBtnUpdate, TrousersimageView, mEdtDescriptionTrousers, mEdtPriceTrousers,
          mEdtTrousersName, trousersrecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
