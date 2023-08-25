.class public final synthetic Lcom/daaw/gb5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w33;


# instance fields
.field public final synthetic a:Lcom/daaw/k43;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/k73;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k43;Ljava/lang/String;Lcom/daaw/k73;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gb5;->a:Lcom/daaw/k43;

    iput-object p2, p0, Lcom/daaw/gb5;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/gb5;->c:Lcom/daaw/k73;

    iput-object p4, p0, Lcom/daaw/gb5;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u53;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/gb5;->a:Lcom/daaw/k43;

    iget-object v1, p0, Lcom/daaw/gb5;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/gb5;->c:Lcom/daaw/k73;

    iget-object v3, p0, Lcom/daaw/gb5;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/u53;->s()Lcom/daaw/m43;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/ls7;->k()Lcom/daaw/fs7;

    move-result-object v4

    check-cast v4, Lcom/daaw/l43;

    invoke-virtual {v4, v0}, Lcom/daaw/l43;->s(Lcom/daaw/k43;)Lcom/daaw/l43;

    invoke-virtual {p1, v4}, Lcom/daaw/u53;->w(Lcom/daaw/l43;)Lcom/daaw/u53;

    invoke-virtual {p1}, Lcom/daaw/u53;->t()Lcom/daaw/n53;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ls7;->k()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/m53;

    invoke-virtual {v0, v1}, Lcom/daaw/m53;->s(Ljava/lang/String;)Lcom/daaw/m53;

    invoke-virtual {v0, v2}, Lcom/daaw/m53;->t(Lcom/daaw/k73;)Lcom/daaw/m53;

    invoke-virtual {p1, v0}, Lcom/daaw/u53;->y(Lcom/daaw/m53;)Lcom/daaw/u53;

    invoke-virtual {p1, v3}, Lcom/daaw/u53;->z(Ljava/lang/String;)Lcom/daaw/u53;

    return-void
.end method
