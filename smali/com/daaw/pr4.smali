.class public final synthetic Lcom/daaw/pr4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Lcom/daaw/cv3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pr4;->a:Lcom/daaw/cv3;

    iput-object p2, p0, Lcom/daaw/pr4;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/pr4;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pr4;->a:Lcom/daaw/cv3;

    iget-object v1, p0, Lcom/daaw/pr4;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/pr4;->c:Ljava/lang/String;

    check-cast p1, Lcom/daaw/lq4;

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/lq4;->m(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
