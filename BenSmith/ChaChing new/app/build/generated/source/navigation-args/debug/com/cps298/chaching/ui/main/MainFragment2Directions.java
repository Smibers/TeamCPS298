package com.cps298.chaching.ui.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.cps298.chaching.R;

public class MainFragment2Directions {
  private MainFragment2Directions() {
  }

  @NonNull
  public static NavDirections actionMainFragmentToSearchFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_searchFragment);
  }
}
