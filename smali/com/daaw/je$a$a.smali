.class public Lcom/daaw/je$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/je$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/text/style/CharacterStyle;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/text/style/CharacterStyle;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/je$a$a;->a:Landroid/text/style/CharacterStyle;

    iput p2, p0, Lcom/daaw/je$a$a;->b:I

    iput p3, p0, Lcom/daaw/je$a$a;->c:I

    return-void
.end method
