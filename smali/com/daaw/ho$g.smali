.class public Lcom/daaw/ho$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ho;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ho;


# direct methods
.method public constructor <init>(Lcom/daaw/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ho$g;->a:Lcom/daaw/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    sget-object v0, Lcom/daaw/ho;->G:Lcom/daaw/tw1;

    iget-object v1, p0, Lcom/daaw/ho$g;->a:Lcom/daaw/ho;

    iget v1, v1, Lcom/daaw/ho;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/ho$g;->a:Lcom/daaw/ho;

    iget-object v3, v2, Lcom/daaw/ho;->y:Lcom/daaw/vn;

    invoke-static {v2}, Lcom/daaw/ho;->h(Lcom/daaw/ho;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
