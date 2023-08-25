.class public Lcom/daaw/hk1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hk1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qz1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/hk1;
    .locals 3

    new-instance v0, Lcom/daaw/hk1;

    iget-object v1, p0, Lcom/daaw/hk1$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/hk1;-><init>(Ljava/lang/String;Lcom/daaw/sz1;)V

    return-object v0
.end method
