package com.daaw;
/* loaded from: classes.dex */
public abstract class a implements ae0 {
    public float a = 1.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e;

    @Override // com.daaw.zc0
    public void a(un unVar) {
        this.a = unVar.o("Speed", 100.0f);
        this.b = unVar.o("speedRandom", 60.0f);
        this.d = unVar.o("trailLength", 0.0f);
    }

    @Override // com.daaw.ae0
    public float b() {
        return this.d;
    }

    public void c(float f) {
        this.a = f;
    }

    public void j(float f) {
        this.b = f;
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.O("Speed", this.a, "behaviour", -300.0f, 300.0f);
        unVar.O("speedRandom", this.b, "behaviour", -300.0f, 300.0f);
        unVar.O("trailLength", this.d, "appearance", 0.0f, 1.0f);
    }

    public void q(float f) {
        this.d = f;
    }
}
