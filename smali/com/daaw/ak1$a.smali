.class public Lcom/daaw/ak1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ak1;->b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ir1$b;

.field public final synthetic b:Lcom/daaw/ak1;


# direct methods
.method public constructor <init>(Lcom/daaw/ak1;Lcom/daaw/ir1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak1$a;->b:Lcom/daaw/ak1;

    iput-object p2, p0, Lcom/daaw/ak1$a;->a:Lcom/daaw/ir1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ak1$a;->b:Lcom/daaw/ak1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ak1;->c(Lcom/daaw/ak1;Lcom/daaw/me0;)Lcom/daaw/me0;

    iget-object v0, p0, Lcom/daaw/ak1$a;->b:Lcom/daaw/ak1;

    invoke-static {v0, v1}, Lcom/daaw/ak1;->d(Lcom/daaw/ak1;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/ak1$a;->a:Lcom/daaw/ir1$b;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ir1$b;->a(Ljava/lang/Object;Z)V

    return-void
.end method
