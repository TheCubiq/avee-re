.class public final Lcom/daaw/qw4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/pw4;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/pw4;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qw4;->a:Lcom/daaw/pw4;

    iput-object p2, p0, Lcom/daaw/qw4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qw4;->a:Lcom/daaw/pw4;

    iget-object v1, p0, Lcom/daaw/qw4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/k08;

    invoke-virtual {v1}, Lcom/daaw/k08;->b()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/pw4;->a(Ljava/util/Set;)Lcom/daaw/nq4;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
