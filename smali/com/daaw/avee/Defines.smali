.class public Lcom/daaw/avee/Defines;
.super Ljava/lang/Object;
.source "Defines.java"


# static fields
.field public static final EXPORT_VIS_NOTIFICATION_ID:I = 0x3

.field public static final HandheldMotionMultiplier:F = 0.06f

.field private static final Instance:Lcom/daaw/avee/Defines;

.field public static final MEDIA_PLAYBACK_NOTIFICATION_ID:I = 0x1

.field public static final PICK_DEST_PROPERTY_REQUEST_CODE:I = 0x35

.field public static final PICK_DEST_PROPERTY_REQUEST_CODE_KITKAT:I = 0x36

.field public static final SAVE_VIS_NOTIFICATION_ID:I = 0x2

.field public static final VIS_CUSTOM_PICK_IMAGE_PROPERTY_REQUEST_CODE:I = 0x2b

.field public static final VIS_CUSTOM_PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT:I = 0x2c

.field public static final VIS_LOAD_PICK_REQUEST_CODE:I = 0x40

.field public static final VIS_LOAD_PICK_REQUEST_CODE_KITKAT:I = 0x41

.field public static final VIS_SAVE_PICK_DEST_PROPERTY_REQUEST_CODE:I = 0x3f


# instance fields
.field internalDrawables:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/daaw/avee/Defines;

    invoke-direct {v0}, Lcom/daaw/avee/Defines;-><init>()V

    sput-object v0, Lcom/daaw/avee/Defines;->Instance:Lcom/daaw/avee/Defines;

    return-void
.end method

.method protected constructor <init>()V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080061

    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "anim128_g_m10_15"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08013f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_blur01"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080142

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_circle_blur4"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080143

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_circle_w_a_64"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080149

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "placeholderart5"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08017f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "vignette80"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08017e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "transparent"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080181

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "white"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080068

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "black"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08014c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "rainbow128"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080141

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_blur01_more"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08011e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "lens_flare"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f08011d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "lens_flare_2"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080145

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_sharp"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080140

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "particle_blur_inv"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080182

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "year2017"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080183

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "year2018"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    const v1, 0x7f080156

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "snowflake"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getInstance()Lcom/daaw/avee/Defines;
    .locals 1

    .line 33
    sget-object v0, Lcom/daaw/avee/Defines;->Instance:Lcom/daaw/avee/Defines;

    return-object v0
.end method


# virtual methods
.method public getDrawableResid(Ljava/lang/String;I)I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/Defines;->internalDrawables:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    return p2

    .line 67
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
