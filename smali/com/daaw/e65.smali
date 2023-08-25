.class public final synthetic Lcom/daaw/e65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/s65;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s65;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e65;->a:Lcom/daaw/s65;

    iput-object p2, p0, Lcom/daaw/e65;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e65;->a:Lcom/daaw/s65;

    iget-object v1, p0, Lcom/daaw/e65;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/s65;->c(Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
