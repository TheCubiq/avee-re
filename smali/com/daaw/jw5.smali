.class public final synthetic Lcom/daaw/jw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/lw5;

.field public final synthetic b:Lcom/daaw/fi6;

.field public final synthetic c:Lcom/daaw/th6;

.field public final synthetic d:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/lw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jw5;->a:Lcom/daaw/lw5;

    iput-object p2, p0, Lcom/daaw/jw5;->b:Lcom/daaw/fi6;

    iput-object p3, p0, Lcom/daaw/jw5;->c:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/jw5;->d:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/jw5;->a:Lcom/daaw/lw5;

    iget-object v1, p0, Lcom/daaw/jw5;->b:Lcom/daaw/fi6;

    iget-object v2, p0, Lcom/daaw/jw5;->c:Lcom/daaw/th6;

    iget-object v3, p0, Lcom/daaw/jw5;->d:Lcom/daaw/tq5;

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/lw5;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;Ljava/lang/Void;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
