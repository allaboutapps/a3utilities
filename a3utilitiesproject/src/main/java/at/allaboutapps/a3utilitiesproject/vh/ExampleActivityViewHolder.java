package at.allaboutapps.a3utilitiesproject.vh;

import android.app.Activity;
import android.widget.CheckBox;

import at.allaboutapps.a3utilitiesproject.R;

public class ExampleActivityViewHolder {

  // CHECKSTYLE:OFF
  public final CheckBox cbO;
  public final CheckBox cbKitkat;
  public final CheckBox cbLollipop;
  public final CheckBox cbMarshmallow;
  public final CheckBox cbNougat;
  // CHECKSTYLE:ON

  public ExampleActivityViewHolder(Activity root) {

    cbO = (CheckBox) root.findViewById(R.id.cbO);
    cbKitkat = (CheckBox) root.findViewById(R.id.cbKitkat);
    cbLollipop = (CheckBox) root.findViewById(R.id.cbLollipop);
    cbMarshmallow = (CheckBox) root.findViewById(R.id.cbMarshmallow);
    cbNougat = (CheckBox) root.findViewById(R.id.cbNougat);
  }
}
