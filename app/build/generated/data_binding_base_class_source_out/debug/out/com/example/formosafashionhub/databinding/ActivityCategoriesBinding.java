// Generated by view binder compiler. Do not edit!
package com.example.formosafashionhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityCategoriesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardviewDresses;

  @NonNull
  public final CardView cardviewJacket;

  @NonNull
  public final CardView cardviewOthers;

  @NonNull
  public final CardView cardviewShirts;

  @NonNull
  public final CardView cardviewSportswear;

  @NonNull
  public final CardView cardviewTrousers;

  private ActivityCategoriesBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardviewDresses, @NonNull CardView cardviewJacket,
      @NonNull CardView cardviewOthers, @NonNull CardView cardviewShirts,
      @NonNull CardView cardviewSportswear, @NonNull CardView cardviewTrousers) {
    this.rootView = rootView;
    this.cardviewDresses = cardviewDresses;
    this.cardviewJacket = cardviewJacket;
    this.cardviewOthers = cardviewOthers;
    this.cardviewShirts = cardviewShirts;
    this.cardviewSportswear = cardviewSportswear;
    this.cardviewTrousers = cardviewTrousers;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCategoriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCategoriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_categories, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCategoriesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardview_dresses;
      CardView cardviewDresses = ViewBindings.findChildViewById(rootView, id);
      if (cardviewDresses == null) {
        break missingId;
      }

      id = R.id.cardview_jacket;
      CardView cardviewJacket = ViewBindings.findChildViewById(rootView, id);
      if (cardviewJacket == null) {
        break missingId;
      }

      id = R.id.cardview_others;
      CardView cardviewOthers = ViewBindings.findChildViewById(rootView, id);
      if (cardviewOthers == null) {
        break missingId;
      }

      id = R.id.cardview_shirts;
      CardView cardviewShirts = ViewBindings.findChildViewById(rootView, id);
      if (cardviewShirts == null) {
        break missingId;
      }

      id = R.id.cardview_sportswear;
      CardView cardviewSportswear = ViewBindings.findChildViewById(rootView, id);
      if (cardviewSportswear == null) {
        break missingId;
      }

      id = R.id.cardview_trousers;
      CardView cardviewTrousers = ViewBindings.findChildViewById(rootView, id);
      if (cardviewTrousers == null) {
        break missingId;
      }

      return new ActivityCategoriesBinding((ConstraintLayout) rootView, cardviewDresses,
          cardviewJacket, cardviewOthers, cardviewShirts, cardviewSportswear, cardviewTrousers);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}