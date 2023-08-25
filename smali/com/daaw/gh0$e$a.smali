.class public abstract Lcom/daaw/gh0$e$a;
.super Lcom/daaw/l0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gh0$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/gh0$e;->i()Lcom/daaw/ch0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/l0;-><init>(Lcom/daaw/ch0;)V

    return-void
.end method


# virtual methods
.method public abstract c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/be0;Lcom/daaw/er0;)Lcom/daaw/mo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Lcom/daaw/be0;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;)",
            "Lcom/daaw/mo1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/be0;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method
