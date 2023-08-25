.class public final synthetic Lcom/daaw/jj0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gi;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/kj0$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/kj0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jj0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/jj0;->b:Lcom/daaw/kj0$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/jj0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/jj0;->b:Lcom/daaw/kj0$a;

    invoke-static {v0, v1, p1}, Lcom/daaw/kj0;->a(Ljava/lang/String;Lcom/daaw/kj0$a;Lcom/daaw/bi;)Lcom/daaw/ij0;

    move-result-object p1

    return-object p1
.end method
