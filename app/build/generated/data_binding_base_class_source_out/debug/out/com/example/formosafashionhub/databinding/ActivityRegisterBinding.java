// Generated by view binder compiler. Do not edit!
package com.example.formosafashionhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.formosafashionhub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardViewContactus;

  @NonNull
  public final Button mBtnRegister;

  @NonNull
  public final EditText mEdtEmailRegister;

  @NonNull
  public final EditText mEdtPasswordRegister;

  @NonNull
  public final EditText mEdtUsernameRegister;

  @NonNull
  public final TextView mTvRegister;

  @NonNull
  public final TextView textViewSignup;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardViewContactus, @NonNull Button mBtnRegister,
      @NonNull EditText mEdtEmailRegister, @NonNull EditText mEdtPasswordRegister,
      @NonNull EditText mEdtUsernameRegister, @NonNull TextView mTvRegister,
      @NonNull TextView textViewSignup) {
    this.rootView = rootView;
    this.cardViewContactus = cardViewContactus;
    this.mBtnRegister = mBtnRegister;
    this.mEdtEmailRegister = mEdtEmailRegister;
    this.mEdtPasswordRegister = mEdtPasswordRegister;
    this.mEdtUsernameRegister = mEdtUsernameRegister;
    this.mTvRegister = mTvRegister;
    this.textViewSignup = textViewSignup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView_contactus;
      CardView cardViewContactus = ViewBindings.findChildViewById(rootView, id);
      if (cardViewContactus == null) {
        break missingId;
      }

      id = R.id.mBtnRegister;
      Button mBtnRegister = ViewBindings.findChildViewById(rootView, id);
      if (mBtnRegister == null) {
        break missingId;
      }

      id = R.id.mEdtEmailRegister;
      EditText mEdtEmailRegister = ViewBindings.findChildViewById(rootView, id);
      if (mEdtEmailRegister == null) {
        break missingId;
      }

      id = R.id.mEdtPasswordRegister;
      EditText mEdtPasswordRegister = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPasswordRegister == null) {
        break missingId;
      }

      id = R.id.mEdtUsernameRegister;
      EditText mEdtUsernameRegister = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUsernameRegister == null) {
        break missingId;
      }

      id = R.id.mTvRegister;
      TextView mTvRegister = ViewBindings.findChildViewById(rootView, id);
      if (mTvRegister == null) {
        break missingId;
      }

      id = R.id.textView_signup;
      TextView textViewSignup = ViewBindings.findChildViewById(rootView, id);
      if (textViewSignup == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, cardViewContactus,
          mBtnRegister, mEdtEmailRegister, mEdtPasswordRegister, mEdtUsernameRegister, mTvRegister,
          textViewSignup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
