.class public final Lcom/daaw/u$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u$b;->a:Ljava/lang/String;

    iput p2, p0, Lcom/daaw/u$b;->b:I

    iput p3, p0, Lcom/daaw/u$b;->d:I

    iput p4, p0, Lcom/daaw/u$b;->c:I

    iput p5, p0, Lcom/daaw/u$b;->e:I

    iput p6, p0, Lcom/daaw/u$b;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIILcom/daaw/u$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/daaw/u$b;-><init>(Ljava/lang/String;IIIII)V

    return-void
.end method
