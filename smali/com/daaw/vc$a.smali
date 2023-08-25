.class public Lcom/daaw/vc$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/vc;->c(Lcom/daaw/de0;Lcom/daaw/u40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/t40<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/u40;

.field public final synthetic b:[F

.field public final synthetic c:Lcom/daaw/vc;


# direct methods
.method public constructor <init>(Lcom/daaw/vc;Lcom/daaw/u40;[F)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc$a;->c:Lcom/daaw/vc;

    iput-object p2, p0, Lcom/daaw/vc$a;->a:Lcom/daaw/u40;

    iput-object p3, p0, Lcom/daaw/vc$a;->b:[F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/daaw/vc$a;->a:Lcom/daaw/u40;

    iget-object v1, p0, Lcom/daaw/vc$a;->b:[F

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/daaw/u40;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/vc$a;->a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
