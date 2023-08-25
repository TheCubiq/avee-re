.class public final synthetic Lcom/daaw/f2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$c;


# instance fields
.field public final synthetic a:Lcom/daaw/su;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/su;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f2;->a:Lcom/daaw/su;

    iput p2, p0, Lcom/daaw/f2;->b:I

    iput p3, p0, Lcom/daaw/f2;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ir1;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/f2;->a:Lcom/daaw/su;

    iget v1, p0, Lcom/daaw/f2;->b:I

    iget v2, p0, Lcom/daaw/f2;->c:I

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/g2;->a(Lcom/daaw/su;IILcom/daaw/ir1;)Lcom/daaw/l70;

    move-result-object p1

    return-object p1
.end method
