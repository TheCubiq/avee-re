.class public final Lcom/daaw/gl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gl5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/gl5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/gl5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/gl5;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/fl5;
    .locals 5

    sget-object v0, Lcom/daaw/z04;->b:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/gl5;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/em5;

    invoke-virtual {v2}, Lcom/daaw/em5;->a()Lcom/daaw/dm5;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/gl5;->d:Lcom/daaw/m08;

    invoke-static {v3}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v3

    new-instance v4, Lcom/daaw/fl5;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/fl5;-><init>(Lcom/daaw/g77;Lcom/daaw/g77;Lcom/daaw/dm5;Lcom/daaw/qz7;)V

    return-object v4
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/gl5;->a()Lcom/daaw/fl5;

    move-result-object v0

    return-object v0
.end method
