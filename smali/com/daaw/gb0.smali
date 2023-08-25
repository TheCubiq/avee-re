.class public interface abstract Lcom/daaw/gb0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/gb0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/er;

    invoke-direct {v0}, Lcom/daaw/er;-><init>()V

    sput-object v0, Lcom/daaw/gb0;->a:Lcom/daaw/gb0;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/daaw/zz;Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/ol1;)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zz;",
            "Landroid/net/Uri;",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            "Lcom/daaw/ol1;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/daaw/zz;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method
