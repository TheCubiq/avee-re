.class Lcom/daaw/avee/Design/PlaybackDesign$27;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/Common/Tuple3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$27;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/Common/Tuple3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 373
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_crossFadeValue:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    .line 374
    new-instance v1, Lcom/daaw/avee/Common/Tuple3;

    div-int/lit16 v0, v0, 0x3e8

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/Design/PlaybackDesign$27;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/PlaybackDesign;->access$200(Lcom/daaw/avee/Design/PlaybackDesign;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/daaw/avee/Common/Tuple3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 370
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaybackDesign$27;->invoke()Lcom/daaw/avee/Common/Tuple3;

    move-result-object v0

    return-object v0
.end method
