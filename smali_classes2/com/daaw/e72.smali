.class public final Lcom/daaw/e72;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Lcom/daaw/y71;->y(Landroid/os/Parcel;)I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v10, v2

    move-wide v15, v10

    move-wide/from16 v18, v15

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v13, v9

    move-object v14, v13

    move-object/from16 v17, v14

    move-object/from16 v20, v17

    const/4 v12, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lcom/daaw/y71;->r(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lcom/daaw/y71;->l(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Lcom/daaw/y71;->x(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzaw;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lcom/daaw/y71;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/zzaw;

    move-object/from16 v20, v2

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Lcom/daaw/y71;->u(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v18, v2

    goto :goto_0

    :pswitch_2
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzaw;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lcom/daaw/y71;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/zzaw;

    move-object/from16 v17, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lcom/daaw/y71;->u(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v15, v2

    goto :goto_0

    :pswitch_4
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzaw;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lcom/daaw/y71;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/zzaw;

    move-object v14, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lcom/daaw/y71;->m(Landroid/os/Parcel;I)Z

    move-result v2

    move v12, v2

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Lcom/daaw/y71;->u(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v10, v2

    goto :goto_0

    :pswitch_8
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzkw;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lcom/daaw/y71;->e(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/zzkw;

    move-object v9, v2

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lcom/daaw/y71;->k(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzac;

    move-object v6, v0

    invoke-direct/range {v6 .. v20}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzkw;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzaw;JLcom/google/android/gms/measurement/internal/zzaw;JLcom/google/android/gms/measurement/internal/zzaw;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/measurement/internal/zzac;

    return-object p1
.end method
