.class public final synthetic Lcom/daaw/a44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jx2;


# instance fields
.field public final synthetic a:Lcom/daaw/l44;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l44;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a44;->a:Lcom/daaw/l44;

    iput-object p2, p0, Lcom/daaw/a44;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/daaw/a44;->c:Z

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/kx2;
    .locals 3

    iget-object v0, p0, Lcom/daaw/a44;->a:Lcom/daaw/l44;

    iget-object v1, p0, Lcom/daaw/a44;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/daaw/a44;->c:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/l44;->n0(Ljava/lang/String;Z)Lcom/daaw/kx2;

    move-result-object v0

    return-object v0
.end method
