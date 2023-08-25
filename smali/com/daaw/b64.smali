.class public final synthetic Lcom/daaw/b64;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final synthetic a:Lcom/daaw/n64;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/n64;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b64;->a:Lcom/daaw/n64;

    iput-object p2, p0, Lcom/daaw/b64;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/daaw/b64;->c:Z

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/p46;
    .locals 3

    iget-object v0, p0, Lcom/daaw/b64;->a:Lcom/daaw/n64;

    iget-object v1, p0, Lcom/daaw/b64;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/daaw/b64;->c:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n64;->f0(Ljava/lang/String;Z)Lcom/daaw/p46;

    move-result-object v0

    return-object v0
.end method
