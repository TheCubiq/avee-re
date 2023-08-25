.class public final Lcom/daaw/xs8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/au8;

.field public final b:[Z

.field public final c:[Z

.field public final d:[Z


# direct methods
.method public constructor <init>(Lcom/daaw/au8;[Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xs8;->a:Lcom/daaw/au8;

    iput-object p2, p0, Lcom/daaw/xs8;->b:[Z

    iget p1, p1, Lcom/daaw/au8;->a:I

    new-array p2, p1, [Z

    iput-object p2, p0, Lcom/daaw/xs8;->c:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/xs8;->d:[Z

    return-void
.end method
