.class public abstract Lcom/daaw/tn$b$a;
.super Lcom/daaw/l0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tn$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/daaw/tn$b;->g:Lcom/daaw/ch0;

    invoke-direct {p0, v0}, Lcom/daaw/l0;-><init>(Lcom/daaw/ch0;)V

    return-void
.end method


# virtual methods
.method public abstract c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method
