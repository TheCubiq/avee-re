.class public final Lcom/daaw/c7$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[Lcom/daaw/pm1;

.field public b:Lcom/google/android/exoplayer2/Format;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [Lcom/daaw/pm1;

    iput-object p1, p0, Lcom/daaw/c7$c;->a:[Lcom/daaw/pm1;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/c7$c;->d:I

    return-void
.end method
