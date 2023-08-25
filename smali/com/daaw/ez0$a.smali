.class public Lcom/daaw/ez0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ez0;->F(Lcom/daaw/de1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/de1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ez0;


# direct methods
.method public constructor <init>(Lcom/daaw/ez0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ez0$a;->p:Lcom/daaw/ez0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/de1;Lcom/daaw/de1;)I
    .locals 0

    iget p1, p1, Lcom/daaw/de1;->c:I

    iget p2, p2, Lcom/daaw/de1;->c:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/de1;

    check-cast p2, Lcom/daaw/de1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ez0$a;->a(Lcom/daaw/de1;Lcom/daaw/de1;)I

    move-result p1

    return p1
.end method
