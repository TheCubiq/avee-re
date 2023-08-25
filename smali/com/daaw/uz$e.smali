.class public final Lcom/daaw/uz$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/daaw/nl1;

.field public final b:I

.field public final c:J


# direct methods
.method public constructor <init>(Lcom/daaw/nl1;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uz$e;->a:Lcom/daaw/nl1;

    iput p2, p0, Lcom/daaw/uz$e;->b:I

    iput-wide p3, p0, Lcom/daaw/uz$e;->c:J

    return-void
.end method
