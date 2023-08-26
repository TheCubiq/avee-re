package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface zzbdl {
    int getTag();

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    <T> T zza(zzbdm<T> zzbdmVar, zzbbb zzbbbVar) throws IOException;

    <T> void zza(List<T> list, zzbdm<T> zzbdmVar, zzbbb zzbbbVar) throws IOException;

    <K, V> void zza(Map<K, V> map, zzbcn<K, V> zzbcnVar, zzbbb zzbbbVar) throws IOException;

    void zzaa(List<Integer> list) throws IOException;

    void zzab(List<Integer> list) throws IOException;

    long zzabl() throws IOException;

    long zzabm() throws IOException;

    int zzabn() throws IOException;

    long zzabo() throws IOException;

    int zzabp() throws IOException;

    boolean zzabq() throws IOException;

    String zzabr() throws IOException;

    zzbah zzabs() throws IOException;

    int zzabt() throws IOException;

    int zzabu() throws IOException;

    int zzabv() throws IOException;

    long zzabw() throws IOException;

    int zzabx() throws IOException;

    long zzaby() throws IOException;

    void zzac(List<Long> list) throws IOException;

    int zzaci() throws IOException;

    boolean zzacj() throws IOException;

    void zzad(List<Integer> list) throws IOException;

    void zzae(List<Long> list) throws IOException;

    @Deprecated
    <T> T zzb(zzbdm<T> zzbdmVar, zzbbb zzbbbVar) throws IOException;

    @Deprecated
    <T> void zzb(List<T> list, zzbdm<T> zzbdmVar, zzbbb zzbbbVar) throws IOException;

    void zzp(List<Double> list) throws IOException;

    void zzq(List<Float> list) throws IOException;

    void zzr(List<Long> list) throws IOException;

    void zzs(List<Long> list) throws IOException;

    void zzt(List<Integer> list) throws IOException;

    void zzu(List<Long> list) throws IOException;

    void zzv(List<Integer> list) throws IOException;

    void zzw(List<Boolean> list) throws IOException;

    void zzx(List<String> list) throws IOException;

    void zzy(List<zzbah> list) throws IOException;

    void zzz(List<Integer> list) throws IOException;
}
