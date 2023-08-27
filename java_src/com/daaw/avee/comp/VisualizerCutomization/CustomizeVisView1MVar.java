package com.daaw.avee.comp.VisualizerCutomization;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Common.View.SimpleViewProgressBar;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import java.util.Locale;
/* loaded from: classes.dex */
public class CustomizeVisView1MVar extends CustomizeVisView1 {
    public CustomizeVisView1MVar(CustomizeVisDialog customizeVisDialog) {
        super(customizeVisDialog);
    }

    public static void createPropertyViewMVarFloat(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, final boolean z2, String str, final String str2, final float f, final float f2, final float f3) {
        final TextView[] textViewArr;
        final TextView[] textViewArr2;
        EditText[] editTextArr;
        EditText[] editTextArr2;
        SeekBar[] seekBarArr;
        SeekBar[] seekBarArr2;
        View view;
        final MVariableFloat mVariableFloat = new MVariableFloat(new MeasuredVar(MeasureDefs.Constant, f, f));
        String[] strArr = z2 ? MeasureDefs.measures2dMVar : MeasureDefs.measures1dMVar;
        MVariableFloat propertyMVariableFloat = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat));
        if (propertyMVariableFloat.getMeasuredVarCount() == 0) {
            propertyMVariableFloat = new MVariableFloat(mVariableFloat);
            customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat);
        }
        MVariableFloat mVariableFloat2 = propertyMVariableFloat;
        View inflate = View.inflate(customizeVisDialog.getActivity(), z ? R.layout.dialog_customize_vis_elementdetail_var_bar : R.layout.dialog_customize_vis_element_var_bar, null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.lineBarBg);
        final View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        int measuredVarCount = mVariableFloat2.getMeasuredVarCount();
        SeekBar[] seekBarArr3 = new SeekBar[measuredVarCount];
        SeekBar[] seekBarArr4 = new SeekBar[measuredVarCount];
        EditText[] editTextArr3 = new EditText[measuredVarCount];
        EditText[] editTextArr4 = new EditText[measuredVarCount];
        TextView[] textViewArr3 = new TextView[measuredVarCount];
        TextView[] textViewArr4 = new TextView[measuredVarCount];
        final Spinner[] spinnerArr = new Spinner[measuredVarCount];
        String[] strArr2 = strArr;
        if (z) {
            Button button = (Button) inflate.findViewById(R.id.btnRemove);
            view = inflate;
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.varContainer);
            textViewArr = textViewArr4;
            textViewArr2 = textViewArr3;
            editTextArr = editTextArr4;
            editTextArr2 = editTextArr3;
            seekBarArr = seekBarArr4;
            seekBarArr2 = seekBarArr3;
            ((Button) inflate.findViewById(R.id.btnAdd)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    MVariableFloat propertyMVariableFloat2 = CustomPropertiesList.this.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat));
                    float f4 = f;
                    CustomPropertiesList.this.putPropertyMVariableFloatValue(str2, new MVariableFloat(propertyMVariableFloat2, new MeasuredVar(MeasureDefs.Constant, f4, f4)));
                    customizeVisDialog.onChildPropertyChanged();
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    MVariableFloat propertyMVariableFloat2 = CustomPropertiesList.this.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat));
                    if (propertyMVariableFloat2.getMeasuredVarCount() > 1) {
                        CustomPropertiesList.this.putPropertyMVariableFloatValue(str2, new MVariableFloat(propertyMVariableFloat2, 0, propertyMVariableFloat2.getMeasuredVarCount() - 1));
                        customizeVisDialog.onChildPropertyChanged();
                    }
                }
            });
            int i = 0;
            while (i < measuredVarCount) {
                MeasuredVar measuredVar = mVariableFloat2.getMeasuredVar(i);
                View inflate2 = View.inflate(customizeVisDialog.getActivity(), R.layout.dialog_customize_vis_element_var_bar_elem, null);
                seekBarArr2[i] = (SeekBar) inflate2.findViewById(R.id.seekBar);
                seekBarArr[i] = (SeekBar) inflate2.findViewById(R.id.seekBar2);
                editTextArr2[i] = (EditText) inflate2.findViewById(R.id.editTxt);
                editTextArr[i] = (EditText) inflate2.findViewById(R.id.editTxt2);
                textViewArr2[i] = (TextView) inflate2.findViewById(R.id.hintA);
                textViewArr[i] = (TextView) inflate2.findViewById(R.id.hintB);
                spinnerArr[i] = (Spinner) inflate2.findViewById(R.id.spinnerType);
                ViewGroup viewGroup3 = viewGroup2;
                viewGroup3.addView(inflate2);
                int i2 = (int) ((f2 - f) / f3);
                seekBarArr2[i].setMax(i2);
                seekBarArr[i].setMax(i2);
                String[] strArr3 = strArr2;
                int StringToIndex = Utils.StringToIndex(strArr3, measuredVar.getMeasure());
                spinnerArr[i].setAdapter((SpinnerAdapter) new ArrayAdapter(customizeVisDialog.getActivity(), 17367048, strArr3));
                if (StringToIndex >= 0) {
                    spinnerArr[i].setSelection(StringToIndex, false);
                }
                customizeVisDialog.ApplySpinnerTheme(spinnerArr[i]);
                i++;
                viewGroup2 = viewGroup3;
                strArr2 = strArr3;
            }
        } else {
            textViewArr = textViewArr4;
            textViewArr2 = textViewArr3;
            editTextArr = editTextArr4;
            editTextArr2 = editTextArr3;
            seekBarArr = seekBarArr4;
            seekBarArr2 = seekBarArr3;
            view = inflate;
        }
        final String[] strArr4 = strArr2;
        final int i3 = measuredVarCount;
        final boolean[] zArr = {false};
        View view2 = view;
        final SeekBar[] seekBarArr5 = seekBarArr2;
        final SeekBar[] seekBarArr6 = seekBarArr;
        final EditText[] editTextArr5 = editTextArr2;
        final EditText[] editTextArr6 = editTextArr;
        Action1<Object> action1 = new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.3
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                MVariableFloat propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat));
                if (z2) {
                    textView.setText(propertyMVariableFloat2.getDisplayString());
                } else {
                    textView.setText(propertyMVariableFloat2.getDisplayString1d());
                }
                SimpleViewProgressBar.SetProgress(findViewById, findViewById2, (f2 - f) / f3, (propertyMVariableFloat2.getDisplayValueX() - f) / f3);
                if (z) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        MeasuredVar measuredVar2 = propertyMVariableFloat2.getMeasuredVar(i4);
                        MeasureDefs.MeasureDef measureDefByName = MeasureDefs.getMeasureDefByName(measuredVar2.getMeasure());
                        boolean z3 = measureDefByName == null || z2 || measureDefByName.isBUsedFor1d;
                        if (z3) {
                            Vec2f measureArgVec2f = measuredVar2.getMeasureArgVec2f();
                            if (!seekBarArr5[i4].equals(obj)) {
                                seekBarArr5[i4].setProgress((int) ((measureArgVec2f.x - f) / f3));
                            }
                            if (!seekBarArr6[i4].equals(obj)) {
                                seekBarArr6[i4].setProgress((int) ((measureArgVec2f.y - f) / f3));
                            }
                            if (!editTextArr5[i4].equals(obj)) {
                                editTextArr5[i4].setText(String.format(Locale.US, "%.3f", Float.valueOf(measureArgVec2f.x)));
                            }
                            if (!editTextArr6[i4].equals(obj)) {
                                editTextArr6[i4].setText(String.format(Locale.US, "%.3f", Float.valueOf(measureArgVec2f.y)));
                            }
                        } else {
                            float measureArgF = measuredVar2.getMeasureArgF();
                            if (!seekBarArr5[i4].equals(obj)) {
                                seekBarArr5[i4].setProgress((int) ((measureArgF - f) / f3));
                            }
                            if (!editTextArr5[i4].equals(obj)) {
                                editTextArr5[i4].setText(String.format(Locale.US, "%.3f", Float.valueOf(measureArgF)));
                            }
                        }
                        if (!spinnerArr[i4].equals(obj)) {
                            spinnerArr[i4].setSelection(Utils.StringToIndex(strArr4, measuredVar2.getMeasure()), false);
                        }
                        if (measureDefByName != null) {
                            textViewArr2[i4].setText(measureDefByName.argAHint);
                            textViewArr[i4].setText(measureDefByName.argBHint);
                        } else {
                            textViewArr2[i4].setText("");
                            textViewArr[i4].setText("");
                        }
                        int i5 = 8;
                        seekBarArr6[i4].setVisibility(z3 ? 0 : 8);
                        editTextArr6[i4].setVisibility(z3 ? 0 : 8);
                        TextView textView2 = textViewArr[i4];
                        if (z3) {
                            i5 = 0;
                        }
                        textView2.setVisibility(i5);
                    }
                }
                zArr[0] = false;
            }
        };
        View view3 = view2;
        final Action1<Object> createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, view2, str2, action1);
        if (z) {
            int i4 = 0;
            while (i4 < i3) {
                final boolean[] zArr2 = zArr;
                int i5 = i3;
                final MVariableFloat mVariableFloat3 = mVariableFloat;
                final String[] strArr5 = strArr4;
                final int i6 = i4;
                final MVariableFloat mVariableFloat4 = mVariableFloat;
                final boolean[] zArr3 = zArr;
                final SeekBar[] seekBarArr7 = seekBarArr2;
                seekBarArr2[i4].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.4
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onProgressChanged(SeekBar seekBar, int i7, boolean z3) {
                        if (!zArr2[0] && z3) {
                            float f4 = (i7 * f3) + f;
                            MVariableFloat propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat3));
                            if (i6 >= propertyMVariableFloat2.getMeasuredVarCount()) {
                                return;
                            }
                            MeasuredVar measuredVar2 = propertyMVariableFloat2.getMeasuredVar(i6);
                            propertyMVariableFloat2.setMeasuredVar(i6, new MeasuredVar(measuredVar2.getMeasure(), f4, measuredVar2.getMeasureArgVec2f().y));
                            customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat2);
                            customizeVisDialog.onPropertyChanged();
                            createPropertyCommon.onInvoke(seekBarArr7[i6]);
                            Action1 action12 = (Action1) func.onInvoke();
                            if (action12 != null) {
                                action12.onInvoke(null);
                            }
                        }
                    }
                });
                final SeekBar[] seekBarArr8 = seekBarArr;
                seekBarArr[i4].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.5
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onProgressChanged(SeekBar seekBar, int i7, boolean z3) {
                        if (!zArr3[0] && z3) {
                            float f4 = (i7 * f3) + f;
                            MVariableFloat propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat4));
                            if (i6 >= propertyMVariableFloat2.getMeasuredVarCount()) {
                                return;
                            }
                            MeasuredVar measuredVar2 = propertyMVariableFloat2.getMeasuredVar(i6);
                            propertyMVariableFloat2.setMeasuredVar(i6, new MeasuredVar(measuredVar2.getMeasure(), measuredVar2.getMeasureArgVec2f().x, f4));
                            customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat2);
                            customizeVisDialog.onPropertyChanged();
                            createPropertyCommon.onInvoke(seekBarArr8[i6]);
                            Action1 action12 = (Action1) func.onInvoke();
                            if (action12 != null) {
                                action12.onInvoke(null);
                            }
                        }
                    }
                });
                final EditText[] editTextArr7 = editTextArr2;
                editTextArr2[i4].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.6
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }

                    public int hashCode() {
                        return super.hashCode();
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        if (zArr3[0]) {
                            return;
                        }
                        float strToFloatSafe = Utils.strToFloatSafe(editable.toString(), f + (f2 * 0.5f));
                        MVariableFloat propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat4));
                        if (i6 >= propertyMVariableFloat2.getMeasuredVarCount()) {
                            return;
                        }
                        MeasuredVar measuredVar2 = propertyMVariableFloat2.getMeasuredVar(i6);
                        propertyMVariableFloat2.setMeasuredVar(i6, new MeasuredVar(measuredVar2.getMeasure(), strToFloatSafe, measuredVar2.getMeasureArgVec2f().y));
                        customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat2);
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(editTextArr7[i6]);
                        Action1 action12 = (Action1) func.onInvoke();
                        if (action12 != null) {
                            action12.onInvoke(null);
                        }
                    }
                });
                final EditText[] editTextArr8 = editTextArr;
                editTextArr[i4].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.7
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }

                    public int hashCode() {
                        return super.hashCode();
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        if (zArr3[0]) {
                            return;
                        }
                        float strToFloatSafe = Utils.strToFloatSafe(editable.toString(), f + (f2 * 0.5f));
                        MVariableFloat propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat4));
                        if (i6 >= propertyMVariableFloat2.getMeasuredVarCount()) {
                            return;
                        }
                        MeasuredVar measuredVar2 = propertyMVariableFloat2.getMeasuredVar(i6);
                        propertyMVariableFloat2.setMeasuredVar(i6, new MeasuredVar(measuredVar2.getMeasure(), measuredVar2.getMeasureArgVec2f().x, strToFloatSafe));
                        customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat2);
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(editTextArr8[i6]);
                        Action1 action12 = (Action1) func.onInvoke();
                        if (action12 != null) {
                            action12.onInvoke(null);
                        }
                    }
                });
                final int i7 = i4;
                spinnerArr[i4].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1MVar.8
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void onItemSelected(AdapterView<?> adapterView, View view4, int i8, long j) {
                        String str3;
                        MVariableFloat propertyMVariableFloat2;
                        CustomizeVisDialog.this.ApplySpinnerTheme(adapterView);
                        if (i8 >= 0) {
                            String[] strArr6 = strArr5;
                            if (i8 < strArr6.length) {
                                str3 = strArr6[i8];
                                propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat4));
                                if (i7 < propertyMVariableFloat2.getMeasuredVarCount()) {
                                    return;
                                }
                                propertyMVariableFloat2.setMeasuredVar(i7, new MeasuredVar(str3, propertyMVariableFloat2.getMeasuredVar(i7).getMeasureArgVec2f()));
                                customPropertiesList.putPropertyMVariableFloatValue(str2, propertyMVariableFloat2);
                                CustomizeVisDialog.this.onPropertyChanged();
                                createPropertyCommon.onInvoke(spinnerArr[i7]);
                                Action1 action12 = (Action1) func.onInvoke();
                                if (action12 != null) {
                                    action12.onInvoke(null);
                                    return;
                                }
                                return;
                            }
                        }
                        str3 = MeasureDefs.Constant;
                        propertyMVariableFloat2 = customPropertiesList.getPropertyMVariableFloat(str2, new MVariableFloat(mVariableFloat4));
                        if (i7 < propertyMVariableFloat2.getMeasuredVarCount()) {
                        }
                    }
                });
                i4++;
                i3 = i5;
                strArr4 = strArr5;
                view3 = view3;
                mVariableFloat = mVariableFloat4;
                zArr = zArr3;
            }
        }
        viewGroup.addView(view3);
    }
}
