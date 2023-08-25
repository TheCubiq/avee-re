.class public final synthetic Lcom/daaw/jm4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/qm4;

.field public final synthetic b:Lcom/daaw/o67;

.field public final synthetic c:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qm4;Lcom/daaw/o67;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jm4;->a:Lcom/daaw/qm4;

    iput-object p2, p0, Lcom/daaw/jm4;->b:Lcom/daaw/o67;

    iput-object p3, p0, Lcom/daaw/jm4;->c:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/jm4;->a:Lcom/daaw/qm4;

    iget-object v1, p0, Lcom/daaw/jm4;->b:Lcom/daaw/o67;

    iget-object v2, p0, Lcom/daaw/jm4;->c:Lcom/daaw/f77;

    check-cast p1, Lcom/daaw/zl4;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/qm4;->a(Lcom/daaw/o67;Lcom/daaw/f77;Lcom/daaw/zl4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
