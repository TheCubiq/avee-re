.class public final Lcom/daaw/th6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Lcom/google/android/gms/internal/ads/zzcem;

.field public final C:Ljava/lang/String;

.field public final D:Lorg/json/JSONObject;

.field public final E:Lorg/json/JSONObject;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public final N:Z

.field public final O:Z

.field public final P:Z

.field public final Q:Z

.field public final R:I

.field public final S:I

.field public final T:Z

.field public final U:Z

.field public final V:Ljava/lang/String;

.field public final W:Lcom/daaw/ui6;

.field public final X:Z

.field public final Y:Z

.field public final Z:I

.field public final a:Ljava/util/List;

.field public final a0:Ljava/lang/String;

.field public final b:I

.field public final b0:I

.field public final c:Ljava/util/List;

.field public final c0:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final d0:Z

.field public final e:Ljava/util/List;

.field public final e0:Lcom/daaw/nr3;

.field public final f:I

.field public final f0:Z

.field public final g:Ljava/util/List;

.field public final g0:Lcom/google/android/gms/ads/internal/client/zzs;

.field public final h:Ljava/util/List;

.field public final h0:Ljava/lang/String;

.field public final i:Ljava/util/List;

.field public final i0:Z

.field public final j:Ljava/util/List;

.field public final j0:Lorg/json/JSONObject;

.field public final k:Ljava/lang/String;

.field public final k0:Z

.field public final l:Ljava/lang/String;

.field public final l0:Lorg/json/JSONObject;

.field public final m:Lcom/google/android/gms/internal/ads/zzcdd;

.field public final m0:Z

.field public final n:Ljava/util/List;

.field public final n0:Ljava/lang/String;

.field public final o:Ljava/util/List;

.field public final o0:Z

.field public final p:Ljava/util/List;

.field public final p0:Ljava/lang/String;

.field public final q:Ljava/util/List;

.field public final r:I

.field public final s:Ljava/util/List;

.field public final t:Lcom/daaw/yh6;

.field public final u:Ljava/util/List;

.field public final v:Ljava/util/List;

.field public final w:Lorg/json/JSONObject;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/util/JsonReader;)V
    .locals 76

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v10

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v13

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v14

    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    new-instance v16, Lorg/json/JSONObject;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONObject;-><init>()V

    new-instance v17, Lorg/json/JSONObject;

    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    new-instance v18, Lorg/json/JSONObject;

    invoke-direct/range {v18 .. v18}, Lorg/json/JSONObject;-><init>()V

    new-instance v19, Lorg/json/JSONObject;

    invoke-direct/range {v19 .. v19}, Lorg/json/JSONObject;-><init>()V

    new-instance v20, Lorg/json/JSONObject;

    invoke-direct/range {v20 .. v20}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    const/16 v22, 0x1

    const/16 v23, -0x1

    const/16 v24, 0x0

    const-string v25, ""

    const/16 v26, 0x0

    move-object/from16 v27, v16

    move-object/from16 v28, v17

    move-object/from16 v29, v18

    move-object/from16 v30, v19

    move-object/from16 v31, v20

    move-object/from16 v32, v21

    move-object/from16 v19, v24

    move-object/from16 v33, v19

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v38, v25

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v53, v42

    move-object/from16 v57, v53

    move-object/from16 v59, v57

    move-object/from16 v62, v59

    move-object/from16 v64, v62

    move-object/from16 v65, v64

    move-object/from16 v66, v65

    move-object/from16 v67, v66

    move-object/from16 v68, v67

    move-object/from16 v73, v68

    const/16 v37, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, -0x1

    const/16 v60, 0x0

    const/16 v61, 0x1

    const/16 v63, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    move-object/from16 v21, v11

    move-object/from16 v20, v12

    move-object/from16 v18, v13

    move-object/from16 v17, v14

    move-object/from16 v16, v15

    move-object/from16 v15, v36

    move-object/from16 v11, v73

    move-object v12, v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_3

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v24

    if-nez v24, :cond_0

    move-object/from16 v74, v25

    goto :goto_1

    :cond_0
    move-object/from16 v74, v24

    :goto_1
    invoke-virtual/range {v74 .. v74}, Ljava/lang/String;->hashCode()I

    move-result v24

    sparse-switch v24, :sswitch_data_0

    move-object/from16 v75, v9

    move-object/from16 v24, v10

    goto/16 :goto_2

    :sswitch_0
    move-object/from16 v24, v10

    const-string v10, "manual_tracking_urls"

    move-object/from16 v75, v9

    move-object/from16 v9, v74

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xf

    goto/16 :goto_3

    :sswitch_1
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "rule_line_external_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x34

    goto/16 :goto_3

    :sswitch_2
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_analytics_logging_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2a

    goto/16 :goto_3

    :sswitch_3
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "renderers"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x0

    goto/16 :goto_3

    :sswitch_4
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "use_third_party_container_height"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x30

    goto/16 :goto_3

    :sswitch_5
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "video_reward_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x7

    goto/16 :goto_3

    :sswitch_6
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_network_class_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x37

    goto/16 :goto_3

    :sswitch_7
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "video_start_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x6

    goto/16 :goto_3

    :sswitch_8
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "bid_response"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x28

    goto/16 :goto_3

    :sswitch_9
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_source_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x39

    goto/16 :goto_3

    :sswitch_a
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "allow_pub_owned_ad_view"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1f

    goto/16 :goto_3

    :sswitch_b
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "cache_hit_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x41

    goto/16 :goto_3

    :sswitch_c
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "rewards"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xb

    goto/16 :goto_3

    :sswitch_d
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "transaction_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x9

    goto/16 :goto_3

    :sswitch_e
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "impression_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x5

    goto/16 :goto_3

    :sswitch_f
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "container_sizes"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x11

    goto/16 :goto_3

    :sswitch_10
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "debug_dialog_string"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1b

    goto/16 :goto_3

    :sswitch_11
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "presentation_error_timeout_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x10

    goto/16 :goto_3

    :sswitch_12
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_closable_area_disabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x24

    goto/16 :goto_3

    :sswitch_13
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_load_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto/16 :goto_3

    :sswitch_14
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "qdata"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x18

    goto/16 :goto_3

    :sswitch_15
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "render_test_label"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x21

    goto/16 :goto_3

    :sswitch_16
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "request_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x43

    goto/16 :goto_3

    :sswitch_17
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "data"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x16

    goto/16 :goto_3

    :sswitch_18
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x17

    goto/16 :goto_3

    :sswitch_19
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x12

    goto/16 :goto_3

    :sswitch_1a
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "allow_custom_click_gesture"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x20

    goto/16 :goto_3

    :sswitch_1b
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_offline_ad"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3c

    goto/16 :goto_3

    :sswitch_1c
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "native_required_asset_viewability"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3e

    goto/16 :goto_3

    :sswitch_1d
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "watermark"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2e

    goto/16 :goto_3

    :sswitch_1e
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "force_disable_hardware_acceleration"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x40

    goto/16 :goto_3

    :sswitch_1f
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_close_button_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x32

    goto/16 :goto_3

    :sswitch_20
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "content_url"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3f

    goto/16 :goto_3

    :sswitch_21
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_close_time_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2d

    goto/16 :goto_3

    :sswitch_22
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "render_timeout_ms"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x26

    goto/16 :goto_3

    :sswitch_23
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "rtb_native_required_assets"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3d

    goto/16 :goto_3

    :sswitch_24
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "imp_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x3

    goto/16 :goto_3

    :sswitch_25
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "safe_browsing"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1a

    goto/16 :goto_3

    :sswitch_26
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "click_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x2

    goto/16 :goto_3

    :sswitch_27
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_source_instance_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3b

    goto/16 :goto_3

    :sswitch_28
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "valid_from_timestamp"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xa

    goto/16 :goto_3

    :sswitch_29
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "active_view"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x19

    goto/16 :goto_3

    :sswitch_2a
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "video_complete_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x8

    goto/16 :goto_3

    :sswitch_2b
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "allocation_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x15

    goto/16 :goto_3

    :sswitch_2c
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "fill_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xc

    goto/16 :goto_3

    :sswitch_2d
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_scroll_aware"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2b

    goto/16 :goto_3

    :sswitch_2e
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x1

    goto/16 :goto_3

    :sswitch_2f
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "presentation_error_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xe

    goto/16 :goto_3

    :sswitch_30
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "allow_pub_rendered_attribution"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1e

    goto/16 :goto_3

    :sswitch_31
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_event_value"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x33

    goto/16 :goto_3

    :sswitch_32
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "extras"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1d

    goto/16 :goto_3

    :sswitch_33
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "test_mode_enabled"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x22

    goto/16 :goto_3

    :sswitch_34
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "adapters"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x14

    goto/16 :goto_3

    :sswitch_35
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_sizes"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x13

    goto/16 :goto_3

    :sswitch_36
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_cover"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x36

    goto/16 :goto_3

    :sswitch_37
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "showable_impression_type"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2c

    goto/16 :goto_3

    :sswitch_38
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "buffer_click_url_as_ready_to_ping"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x42

    goto/16 :goto_3

    :sswitch_39
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "enable_omid"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x27

    goto/16 :goto_3

    :sswitch_3a
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "orientation"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x25

    goto/16 :goto_3

    :sswitch_3b
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_custom_close_blocked"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x23

    goto/16 :goto_3

    :sswitch_3c
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "nofill_urls"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0xd

    goto/16 :goto_3

    :sswitch_3d
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "backend_query_id"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x2f

    goto/16 :goto_3

    :sswitch_3e
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "is_interscroller"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x35

    goto :goto_3

    :sswitch_3f
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_source_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x38

    goto :goto_3

    :sswitch_40
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "play_prewarm_options"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x31

    goto :goto_3

    :sswitch_41
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "omid_settings"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x29

    goto :goto_3

    :sswitch_42
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "debug_signals"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x1c

    goto :goto_3

    :sswitch_43
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v74

    const-string v10, "ad_source_instance_name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x3a

    goto :goto_3

    :cond_1
    :goto_2
    const/4 v9, -0x1

    :goto_3
    packed-switch v9, :pswitch_data_0

    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v73

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v72

    goto/16 :goto_4

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v32, v9

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v71

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v36, v9

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v70

    goto/16 :goto_4

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v31, v9

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v69

    goto/16 :goto_4

    :pswitch_8
    sget-object v9, Lcom/daaw/g93;->j6:Lcom/daaw/y83;

    invoke-virtual {v9}, Lcom/daaw/y83;->l()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v68

    goto/16 :goto_4

    :pswitch_9
    sget-object v9, Lcom/daaw/g93;->j6:Lcom/daaw/y83;

    invoke-virtual {v9}, Lcom/daaw/y83;->l()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v67

    goto/16 :goto_4

    :pswitch_a
    sget-object v9, Lcom/daaw/g93;->j6:Lcom/daaw/y83;

    invoke-virtual {v9}, Lcom/daaw/y83;->l()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v66

    goto/16 :goto_4

    :pswitch_b
    sget-object v9, Lcom/daaw/g93;->j6:Lcom/daaw/y83;

    invoke-virtual {v9}, Lcom/daaw/y83;->l()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v65

    goto/16 :goto_4

    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_4

    :pswitch_c
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v64

    goto/16 :goto_4

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v30, v9

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v63

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v62

    goto/16 :goto_4

    :pswitch_10
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/ads/internal/client/zzs;->zza(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/client/zzs;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v35, v9

    goto/16 :goto_5

    :pswitch_11
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v61

    goto/16 :goto_4

    :pswitch_12
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/nr3;->a(Lorg/json/JSONObject;)Lcom/daaw/nr3;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v34, v9

    goto/16 :goto_5

    :pswitch_13
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v60

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v59

    goto/16 :goto_4

    :pswitch_15
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v57

    goto/16 :goto_4

    :pswitch_16
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v58

    goto/16 :goto_4

    :pswitch_17
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v56

    goto/16 :goto_4

    :pswitch_18
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v55

    goto/16 :goto_4

    :pswitch_19
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v54

    goto/16 :goto_4

    :pswitch_1a
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v29, v9

    goto/16 :goto_5

    :pswitch_1b
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v53

    goto/16 :goto_4

    :pswitch_1c
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v52

    goto/16 :goto_4

    :pswitch_1d
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v51

    goto/16 :goto_4

    :pswitch_1e
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/th6;->d(Ljava/lang/String;)I

    move-result v50

    goto/16 :goto_4

    :pswitch_1f
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v49

    goto/16 :goto_4

    :pswitch_20
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v48

    goto/16 :goto_4

    :pswitch_21
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v47

    goto :goto_4

    :pswitch_22
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v46

    goto :goto_4

    :pswitch_23
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v45

    goto :goto_4

    :pswitch_24
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v44

    goto :goto_4

    :pswitch_25
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v43

    goto :goto_4

    :pswitch_26
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v28, v9

    goto/16 :goto_5

    :pswitch_27
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v27, v9

    goto/16 :goto_5

    :pswitch_28
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v42

    goto :goto_4

    :pswitch_29
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzcem;->h(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzcem;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v33, v9

    goto/16 :goto_5

    :pswitch_2a
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v41

    goto :goto_4

    :pswitch_2b
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v40

    goto :goto_4

    :pswitch_2c
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v39

    goto :goto_4

    :pswitch_2d
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzh(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v16, v9

    goto/16 :goto_5

    :pswitch_2e
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v38

    :goto_4
    move-object/from16 v10, p1

    goto/16 :goto_5

    :pswitch_2f
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v18, v9

    goto/16 :goto_5

    :pswitch_30
    invoke-static/range {p1 .. p1}, Lcom/daaw/uh6;->a(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v10, p1

    move-object/from16 v17, v9

    goto/16 :goto_5

    :pswitch_31
    new-instance v9, Lcom/daaw/yh6;

    move-object/from16 v10, p1

    invoke-direct {v9, v10}, Lcom/daaw/yh6;-><init>(Landroid/util/JsonReader;)V

    move-object/from16 v19, v9

    goto/16 :goto_5

    :pswitch_32
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/daaw/uh6;->a(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v20, v9

    goto/16 :goto_5

    :pswitch_33
    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v37

    goto/16 :goto_5

    :pswitch_34
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v21, v9

    goto/16 :goto_5

    :pswitch_35
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v24, v9

    goto/16 :goto_5

    :pswitch_36
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v9

    goto/16 :goto_6

    :pswitch_37
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v8

    goto/16 :goto_5

    :pswitch_38
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zze(Landroid/util/JsonReader;)Lorg/json/JSONArray;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzcdd;->h(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzcdd;

    move-result-object v9

    move-object v15, v9

    goto :goto_5

    :pswitch_39
    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :pswitch_3a
    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :pswitch_3b
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v7

    goto :goto_5

    :pswitch_3c
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v6

    goto :goto_5

    :pswitch_3d
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v5

    goto :goto_5

    :pswitch_3e
    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    move-result v9

    invoke-static {v9}, Lcom/daaw/th6;->c(I)I

    move-result v14

    goto :goto_5

    :pswitch_3f
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v4

    goto :goto_5

    :pswitch_40
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v3

    goto :goto_5

    :pswitch_41
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v2

    goto :goto_5

    :pswitch_42
    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/th6;->b(Ljava/lang/String;)I

    move-result v13

    goto :goto_5

    :pswitch_43
    move-object/from16 v10, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzd(Landroid/util/JsonReader;)Ljava/util/List;

    move-result-object v1

    :goto_5
    move-object/from16 v9, v75

    :goto_6
    move-object/from16 v10, v24

    goto/16 :goto_0

    :cond_3
    move-object/from16 v75, v9

    move-object/from16 v24, v10

    move-object/from16 v10, p1

    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    iput-object v1, v0, Lcom/daaw/th6;->a:Ljava/util/List;

    iput v13, v0, Lcom/daaw/th6;->b:I

    iput-object v2, v0, Lcom/daaw/th6;->c:Ljava/util/List;

    iput-object v3, v0, Lcom/daaw/th6;->d:Ljava/util/List;

    iput-object v4, v0, Lcom/daaw/th6;->g:Ljava/util/List;

    iput v14, v0, Lcom/daaw/th6;->f:I

    iput-object v5, v0, Lcom/daaw/th6;->h:Ljava/util/List;

    iput-object v6, v0, Lcom/daaw/th6;->i:Ljava/util/List;

    iput-object v7, v0, Lcom/daaw/th6;->j:Ljava/util/List;

    iput-object v12, v0, Lcom/daaw/th6;->k:Ljava/lang/String;

    iput-object v11, v0, Lcom/daaw/th6;->l:Ljava/lang/String;

    iput-object v15, v0, Lcom/daaw/th6;->m:Lcom/google/android/gms/internal/ads/zzcdd;

    iput-object v8, v0, Lcom/daaw/th6;->n:Ljava/util/List;

    iput-object v9, v0, Lcom/daaw/th6;->o:Ljava/util/List;

    move-object/from16 v10, v24

    iput-object v10, v0, Lcom/daaw/th6;->p:Ljava/util/List;

    move-object/from16 v11, v21

    iput-object v11, v0, Lcom/daaw/th6;->q:Ljava/util/List;

    move/from16 v1, v37

    iput v1, v0, Lcom/daaw/th6;->r:I

    move-object/from16 v12, v20

    iput-object v12, v0, Lcom/daaw/th6;->s:Ljava/util/List;

    move-object/from16 v1, v19

    iput-object v1, v0, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    move-object/from16 v13, v18

    iput-object v13, v0, Lcom/daaw/th6;->u:Ljava/util/List;

    move-object/from16 v14, v17

    iput-object v14, v0, Lcom/daaw/th6;->v:Ljava/util/List;

    move-object/from16 v1, v38

    iput-object v1, v0, Lcom/daaw/th6;->x:Ljava/lang/String;

    move-object/from16 v15, v16

    iput-object v15, v0, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    move-object/from16 v1, v39

    iput-object v1, v0, Lcom/daaw/th6;->y:Ljava/lang/String;

    move-object/from16 v1, v40

    iput-object v1, v0, Lcom/daaw/th6;->z:Ljava/lang/String;

    move-object/from16 v1, v41

    iput-object v1, v0, Lcom/daaw/th6;->A:Ljava/lang/String;

    move-object/from16 v1, v33

    iput-object v1, v0, Lcom/daaw/th6;->B:Lcom/google/android/gms/internal/ads/zzcem;

    move-object/from16 v1, v42

    iput-object v1, v0, Lcom/daaw/th6;->C:Ljava/lang/String;

    move-object/from16 v1, v27

    iput-object v1, v0, Lcom/daaw/th6;->D:Lorg/json/JSONObject;

    move-object/from16 v1, v28

    iput-object v1, v0, Lcom/daaw/th6;->E:Lorg/json/JSONObject;

    move/from16 v1, v43

    iput-boolean v1, v0, Lcom/daaw/th6;->K:Z

    move/from16 v1, v44

    iput-boolean v1, v0, Lcom/daaw/th6;->L:Z

    move/from16 v1, v45

    iput-boolean v1, v0, Lcom/daaw/th6;->M:Z

    move/from16 v1, v46

    iput-boolean v1, v0, Lcom/daaw/th6;->N:Z

    move/from16 v1, v47

    iput-boolean v1, v0, Lcom/daaw/th6;->O:Z

    move/from16 v1, v48

    iput-boolean v1, v0, Lcom/daaw/th6;->P:Z

    move/from16 v1, v49

    iput-boolean v1, v0, Lcom/daaw/th6;->Q:Z

    move/from16 v1, v50

    iput v1, v0, Lcom/daaw/th6;->R:I

    move/from16 v1, v51

    iput v1, v0, Lcom/daaw/th6;->S:I

    move/from16 v1, v52

    iput-boolean v1, v0, Lcom/daaw/th6;->U:Z

    move-object/from16 v1, v53

    iput-object v1, v0, Lcom/daaw/th6;->V:Ljava/lang/String;

    new-instance v1, Lcom/daaw/ui6;

    move-object/from16 v2, v29

    invoke-direct {v1, v2}, Lcom/daaw/ui6;-><init>(Lorg/json/JSONObject;)V

    iput-object v1, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    move/from16 v1, v54

    iput-boolean v1, v0, Lcom/daaw/th6;->X:Z

    move/from16 v1, v55

    iput-boolean v1, v0, Lcom/daaw/th6;->Y:Z

    move/from16 v1, v56

    iput v1, v0, Lcom/daaw/th6;->Z:I

    move-object/from16 v1, v57

    iput-object v1, v0, Lcom/daaw/th6;->a0:Ljava/lang/String;

    move/from16 v1, v58

    iput v1, v0, Lcom/daaw/th6;->b0:I

    move-object/from16 v1, v59

    iput-object v1, v0, Lcom/daaw/th6;->c0:Ljava/lang/String;

    move/from16 v1, v60

    iput-boolean v1, v0, Lcom/daaw/th6;->d0:Z

    move-object/from16 v1, v34

    iput-object v1, v0, Lcom/daaw/th6;->e0:Lcom/daaw/nr3;

    move/from16 v1, v61

    iput-boolean v1, v0, Lcom/daaw/th6;->f0:Z

    move-object/from16 v1, v35

    iput-object v1, v0, Lcom/daaw/th6;->g0:Lcom/google/android/gms/ads/internal/client/zzs;

    move-object/from16 v1, v62

    iput-object v1, v0, Lcom/daaw/th6;->h0:Ljava/lang/String;

    move/from16 v1, v63

    iput-boolean v1, v0, Lcom/daaw/th6;->i0:Z

    move-object/from16 v1, v30

    iput-object v1, v0, Lcom/daaw/th6;->j0:Lorg/json/JSONObject;

    move-object/from16 v1, v64

    iput-object v1, v0, Lcom/daaw/th6;->F:Ljava/lang/String;

    move-object/from16 v1, v65

    iput-object v1, v0, Lcom/daaw/th6;->G:Ljava/lang/String;

    move-object/from16 v1, v66

    iput-object v1, v0, Lcom/daaw/th6;->H:Ljava/lang/String;

    move-object/from16 v1, v67

    iput-object v1, v0, Lcom/daaw/th6;->I:Ljava/lang/String;

    move-object/from16 v1, v68

    iput-object v1, v0, Lcom/daaw/th6;->J:Ljava/lang/String;

    move/from16 v1, v69

    iput-boolean v1, v0, Lcom/daaw/th6;->k0:Z

    move-object/from16 v1, v31

    iput-object v1, v0, Lcom/daaw/th6;->l0:Lorg/json/JSONObject;

    move/from16 v1, v70

    iput-boolean v1, v0, Lcom/daaw/th6;->m0:Z

    move-object/from16 v1, v36

    iput-object v1, v0, Lcom/daaw/th6;->n0:Ljava/lang/String;

    move/from16 v1, v71

    iput-boolean v1, v0, Lcom/daaw/th6;->o0:Z

    move-object/from16 v1, v32

    iput-object v1, v0, Lcom/daaw/th6;->e:Ljava/util/List;

    move/from16 v1, v72

    iput-boolean v1, v0, Lcom/daaw/th6;->T:Z

    move-object/from16 v1, v73

    iput-object v1, v0, Lcom/daaw/th6;->p0:Ljava/lang/String;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7f724a93 -> :sswitch_43
        -0x760d5f21 -> :sswitch_42
        -0x752755d7 -> :sswitch_41
        -0x6c01c604 -> :sswitch_40
        -0x69ea0ded -> :sswitch_3f
        -0x631f353f -> :sswitch_3e
        -0x60966ac3 -> :sswitch_3d
        -0x5c657e81 -> :sswitch_3c
        -0x55d641b4 -> :sswitch_3b
        -0x55cd0a30 -> :sswitch_3a
        -0x552c574b -> :sswitch_39
        -0x53d154ad -> :sswitch_38
        -0x53abfab8 -> :sswitch_37
        -0x51fb2365 -> :sswitch_36
        -0x511c568a -> :sswitch_35
        -0x4dd838fc -> :sswitch_34
        -0x4daf44ce -> :sswitch_33
        -0x4cd5119d -> :sswitch_32
        -0x49ea2690 -> :sswitch_31
        -0x49901bd3 -> :sswitch_30
        -0x45a06900 -> :sswitch_2f
        -0x44ada62a -> :sswitch_2e
        -0x4456b89f -> :sswitch_2d
        -0x428259e0 -> :sswitch_2c
        -0x407d0b26 -> :sswitch_2b
        -0x4041c09a -> :sswitch_2a
        -0x3ea917c2 -> :sswitch_29
        -0x3a916a9c -> :sswitch_28
        -0x39f06783 -> :sswitch_27
        -0x2e4deec5 -> :sswitch_26
        -0x207016c7 -> :sswitch_25
        -0x1a0cf689 -> :sswitch_24
        -0x181b2b46 -> :sswitch_23
        -0x18198873 -> :sswitch_22
        -0x17b47e0b -> :sswitch_21
        -0x172cbb57 -> :sswitch_20
        -0x160a4bb0 -> :sswitch_1f
        -0xcb8faf4 -> :sswitch_1e
        -0xcb8979c -> :sswitch_1d
        -0xabddb62 -> :sswitch_1c
        -0x93741cc -> :sswitch_1b
        -0x1bfab86 -> :sswitch_1a
        0xc23 -> :sswitch_19
        0xd1b -> :sswitch_18
        0x2eefaa -> :sswitch_17
        0x23640cb -> :sswitch_16
        0x3c44b50 -> :sswitch_15
        0x6674f9b -> :sswitch_14
        0xdba7381 -> :sswitch_13
        0x18f0294b -> :sswitch_12
        0x20bbc660 -> :sswitch_11
        0x239cb9fc -> :sswitch_10
        0x2cfeab54 -> :sswitch_f
        0x2f2793b0 -> :sswitch_e
        0x3c3c4a1c -> :sswitch_d
        0x419a9724 -> :sswitch_c
        0x46b1262d -> :sswitch_b
        0x4ec7dc6f -> :sswitch_a
        0x55aac6a3 -> :sswitch_9
        0x619b1543 -> :sswitch_8
        0x61b080e5 -> :sswitch_7
        0x6483313f -> :sswitch_6
        0x64a20a30 -> :sswitch_5
        0x6b3eec6e -> :sswitch_4
        0x6da6d810 -> :sswitch_3
        0x6fc8b8d3 -> :sswitch_2
        0x7b455927 -> :sswitch_1
        0x7b8dc4b3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public static a(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "UNKNOWN"

    return-object p0

    :pswitch_0
    const-string p0, "REWARDED_INTERSTITIAL"

    return-object p0

    :pswitch_1
    const-string p0, "APP_OPEN_AD"

    return-object p0

    :pswitch_2
    const-string p0, "REWARDED"

    return-object p0

    :pswitch_3
    const-string p0, "NATIVE"

    return-object p0

    :pswitch_4
    const-string p0, "NATIVE_EXPRESS"

    return-object p0

    :pswitch_5
    const-string p0, "INTERSTITIAL"

    return-object p0

    :pswitch_6
    const-string p0, "BANNER"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)I
    .locals 1

    const-string v0, "banner"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "interstitial"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "native_express"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "native"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "rewarded"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "app_open_ad"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "app_open_ad_v2"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    const-string v0, "rewarded_interstitial"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0

    :cond_7
    :goto_0
    const/4 p0, 0x6

    return p0
.end method

.method public static c(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    return p0
.end method

.method public static final d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "landscape"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x6

    return p0

    :cond_0
    const-string v0, "portrait"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x7

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method
