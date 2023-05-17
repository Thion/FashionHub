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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView3;

  @NonNull
  public final Button mBtnLogin;

  @NonNull
  public final EditText mEdtEmailLogin;

  @NonNull
  public final EditText mEdtPasswordLogin;

  @NonNull
  public final TextView mTvLogin;

  @NonNull
  public final TextView textViewSignin;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView3,
      @NonNull Button mBtnLogin, @NonNull EditText mEdtEmailLogin,
      @NonNull EditText mEdtPasswordLogin, @NonNull TextView mTvLogin,
      @NonNull TextView textViewSignin) {
    this.rootView = rootView;
    this.cardView3 = cardView3;
    this.mBtnLogin = mBtnLogin;
    this.mEdtEmailLogin = mEdtEmailLogin;
    this.mEdtPasswordLogin = mEdtPasswordLogin;
    this.mTvLogin = mTvLogin;
    this.textViewSignin = textViewSignin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView3;
      CardView cardView3 = ViewBindings.findChildViewById(rootView, id);
      if (cardView3 == null) {
        break missingId;
      }

      id = R.id.mBtnLogin;
      Button mBtnLogin = ViewBindings.findChildViewById(rootView, id);
      if (mBtnLogin == null) {
        break missingId;
      }

      id = R.id.mEdtEmailLogin;
      EditText mEdtEmailLogin = ViewBindings.findChildViewById(rootView, id);
      if (mEdtEmailLogin == null) {
        break missingId;
      }

      id = R.id.mEdtPasswordLogin;
      EditText mEdtPasswordLogin = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPasswordLogin == null) {
        break missingId;
      }

      id = R.id.mTvLogin;
      TextView mTvLogin = ViewBindings.findChildViewById(rootView, id);
      if (mTvLogin == null) {
        break missingId;
      }

      id = R.id.textView_signin;
      TextView textViewSignin = ViewBindings.findChildViewById(rootView, id);
      if (textViewSignin == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, cardView3, mBtnLogin,
          mEdtEmailLogin, mEdtPasswordLogin, mTvLogin, textViewSignin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}