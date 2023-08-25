.class public final Lcom/daaw/h81$a;
.super Lcom/daaw/si0;
.source ""

# interfaces
.implements Lcom/daaw/x40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/h81;-><init>(Lcom/daaw/k81;Lcom/daaw/nt1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/si0;",
        "Lcom/daaw/x40<",
        "Lcom/daaw/i81;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic q:Lcom/daaw/nt1;


# direct methods
.method public constructor <init>(Lcom/daaw/nt1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h81$a;->q:Lcom/daaw/nt1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/daaw/si0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/h81$a;->d()Lcom/daaw/i81;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/daaw/i81;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h81$a;->q:Lcom/daaw/nt1;

    invoke-static {v0}, Lcom/daaw/g81;->b(Lcom/daaw/nt1;)Lcom/daaw/i81;

    move-result-object v0

    return-object v0
.end method
