.class public Lcom/daaw/vs0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g70;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vs0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/g70<",
        "TR;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZ)Lcom/daaw/f70;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/daaw/f70<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/vs0;->b()Lcom/daaw/vs0;

    move-result-object p1

    return-object p1
.end method
