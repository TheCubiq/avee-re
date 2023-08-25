.class public Lcom/daaw/ja1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/je0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ja1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ja1;


# direct methods
.method public constructor <init>(Lcom/daaw/ja1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ja1$a;->a:Lcom/daaw/ja1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/ja1$a;->a:Lcom/daaw/ja1;

    invoke-static {v0}, Lcom/daaw/ja1;->q(Lcom/daaw/ja1;)[F

    move-result-object v0

    aget p1, v0, p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ja1$a;->a:Lcom/daaw/ja1;

    invoke-static {v0}, Lcom/daaw/ja1;->q(Lcom/daaw/ja1;)[F

    move-result-object v0

    array-length v0, v0

    return v0
.end method
