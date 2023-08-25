.class public Lcom/daaw/n7$a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n7$a;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/daaw/n7$a;


# direct methods
.method public constructor <init>(Lcom/daaw/n7$a;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n7$a$f;->q:Lcom/daaw/n7$a;

    iput p2, p0, Lcom/daaw/n7$a$f;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a$f;->q:Lcom/daaw/n7$a;

    invoke-static {v0}, Lcom/daaw/n7$a;->a(Lcom/daaw/n7$a;)Lcom/daaw/n7;

    move-result-object v0

    iget v1, p0, Lcom/daaw/n7$a$f;->p:I

    invoke-interface {v0, v1}, Lcom/daaw/n7;->a(I)V

    return-void
.end method
