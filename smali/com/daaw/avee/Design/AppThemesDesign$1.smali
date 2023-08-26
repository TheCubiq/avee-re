.class Lcom/daaw/avee/Design/AppThemesDesign$1;
.super Ljava/lang/Object;
.source "AppThemesDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AppThemesDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AppThemesDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AppThemesDesign;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/daaw/avee/Design/AppThemesDesign$1;->this$0:Lcom/daaw/avee/Design/AppThemesDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 28
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p1}, Lcom/daaw/avee/MainActivity;->recreate()V

    :cond_0
    return-void
.end method
