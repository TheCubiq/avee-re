.class public final synthetic Lcom/daaw/zp1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/eq1;

.field public final synthetic b:Lcom/daaw/sn1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;Lcom/daaw/sn1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zp1;->a:Lcom/daaw/eq1;

    iput-object p2, p0, Lcom/daaw/zp1;->b:Lcom/daaw/sn1;

    iput p3, p0, Lcom/daaw/zp1;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/zp1;->a:Lcom/daaw/eq1;

    iget-object v1, p0, Lcom/daaw/zp1;->b:Lcom/daaw/sn1;

    iget v2, p0, Lcom/daaw/zp1;->c:I

    invoke-static {v0, v1, v2}, Lcom/daaw/eq1;->h(Lcom/daaw/eq1;Lcom/daaw/sn1;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
